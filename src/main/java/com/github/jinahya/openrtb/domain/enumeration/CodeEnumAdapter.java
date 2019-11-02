package com.github.jinahya.openrtb.domain.enumeration;

import javax.json.bind.adapter.JsonbAdapter;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static java.util.Objects.requireNonNull;

public abstract class CodeEnumAdapter<T extends CodeEnum> implements JsonbAdapter<T, Integer> {

    // -----------------------------------------------------------------------------------------------------------------
    public CodeEnumAdapter(final Class<T> enumClass) {
        super();
        this.enumClass = requireNonNull(enumClass, "enumClass is null");
    }

    // -----------------------------------------------------------------------------------------------------------------
    @Override
    public Integer adaptToJson(final T obj) throws Exception {
        if (obj == null) {
            return null;
        }
        return obj.getCode();
    }

    @SuppressWarnings({"unchecked"})
    @Override
    public T adaptFromJson(final Integer obj) throws Exception {
        if (obj == null) {
            return null;
        }
        try {
            return (T) valueOfCodeHandle().invoke(null, obj);
        } catch (final Throwable t) {
            throw new RuntimeException(t);
        }
    }

    // -----------------------------------------------------------------------------------------------------------------
    private MethodHandle valueOfCodeHandle() {
        if (valueOfCodeHandle == null) {
            try {
                final Method valueOfCodeMethod = enumClass.getDeclaredMethod("valueOfCode");
                if (!Modifier.isStatic(valueOfCodeMethod.getModifiers())) {
                    throw new RuntimeException("not static: " + valueOfCodeMethod);
                }
                if (!valueOfCodeMethod.isAccessible()) {
                    valueOfCodeMethod.setAccessible(true);
                }
                valueOfCodeHandle = MethodHandles.lookup().unreflect(valueOfCodeMethod);
            } catch (final ReflectiveOperationException roe) {
                throw new RuntimeException(roe);
            }
        }
        return valueOfCodeHandle;
    }

    // -----------------------------------------------------------------------------------------------------------------
    protected final Class<T> enumClass;

    private transient MethodHandle valueOfCodeHandle;
}
