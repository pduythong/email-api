package cs490.notification.email.exception;

import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    private String resourceName;
    private String fieldName;
    private Object fieldValue;

    public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public ResourceNotFoundException(Class clazz, String fieldName, Object fieldValue) {
        super(String.format("%s not found with %s : %s", clazz.getSimpleName(), fieldName, fieldValue));
        this.resourceName = clazz.getSimpleName();
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public ResourceNotFoundException(Class clazz, String... searchParamsMap) {
        super(ResourceNotFoundException.generateMessage(clazz.getSimpleName(),
                toMap(String.class, String.class, searchParamsMap)));
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

    private static String generateMessage(String entity, Map<String, String> searchParams) {
        return StringUtils.capitalize(entity) +
                " was not found for parameters " +
                searchParams;
    }

    private static <K, V> Map<K, V> toMap(Class<K> keyType, Class<V> valueType, Object... entries) {
        if (entries.length % 2 == 1) {
            throw new IllegalArgumentException("Invalid entries");
        }
        return IntStream
                .range(0, entries.length / 2).map(i -> i * 2)
                .collect(
                        HashMap::new,
                        (m, i) -> m.put(keyType.cast(entries[i]), valueType.cast(entries[i + 1])),
                        Map::putAll
                );
    }
}
