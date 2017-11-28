package classes.objects.customobject.element;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 28.11.2017.
 * Credits goes to mixel
 * https://stackoverflow.com/questions/14373417/how-to-dynamically-handle-json-response-array-object-using-gson
 */
public class ArrayAdapter<T> extends TypeAdapter<List<T>> {
    private Class<T> adapterclass;

    public ArrayAdapter(Class<T> adapterclass) {

        this.adapterclass = adapterclass;
    }

    public List<T> read(JsonReader reader) throws IOException {


        List<T> list = new ArrayList<T>();

        Gson gson = new Gson();

        if (reader.peek() == JsonToken.BEGIN_OBJECT) {

            T inning = (T) gson.fromJson(reader, adapterclass);
            list.add(inning);

        } else if (reader.peek() == JsonToken.BEGIN_ARRAY) {

            reader.beginArray();
            while (reader.hasNext()) {
                T inning = (T) gson.fromJson(reader, adapterclass);
                list.add(inning);
            }
            reader.endArray();

        } else {
            reader.skipValue();
        }

        return list;
    }

    public void write(JsonWriter writer, List<T> value) throws IOException {

    }

}