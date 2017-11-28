package classes.objects.customobject.element.adapter;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by User on 28.11.2017.
 * Credits goes to mixel
 * https://stackoverflow.com/questions/14373417/how-to-dynamically-handle-json-response-array-object-using-gson
 */
public class ArrayAdapterFactory implements TypeAdapterFactory {

    @SuppressWarnings({"unchecked"})
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> type) {

        ArrayAdapter typeAdapter = null;
        try {
            if (type.getRawType() == List.class) {

                typeAdapter = new ArrayAdapter(
                        (Class) ((ParameterizedType) type.getType())
                                .getActualTypeArguments()[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return typeAdapter;
    }
}