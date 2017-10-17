/*
 * code https://github.com/jittagornp/excel-object-mapping
 */
package com.blogspot.na5cent.exom.util;

import java.lang.reflect.Field;

/**
 * @author redcrow
 * @author Mohsen.Mahmoudi
 */
public interface EachFieldCallback {

    void each(Field field, String name, Integer index) throws Throwable;
}
