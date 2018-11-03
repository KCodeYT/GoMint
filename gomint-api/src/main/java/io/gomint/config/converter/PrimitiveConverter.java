/*
 * Copyright (c) 2018 GoMint team
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.config.converter;


import java.lang.reflect.ParameterizedType;
import java.util.HashSet;

/**
 * @author geNAZt
 * @version 1.0
 */
public class PrimitiveConverter implements Converter {

    private HashSet<String> types = new HashSet<String>() {{
        add( "boolean" );
        add( "char" );
        add( "byte" );
        add( "short" );
        add( "int" );
        add( "long" );
        add( "float" );
        add( "double" );
    }};

    @Override
    public Object toConfig( Class<?> type, Object obj, ParameterizedType parameterizedType ) {
        return obj;
    }

    @Override
    public Object fromConfig( Class type, Object section, ParameterizedType genericType ) {
        switch ( type.getSimpleName() ) {
            case "short":
                return ( section instanceof Short ) ? section : new Integer( (int) section ).shortValue();
            case "byte":
                return ( section instanceof Byte ) ? section : new Integer( (int) section ).byteValue();
            case "float":
                if ( section instanceof Integer ) {
                    return new Double( (int) section ).floatValue();
                }

                return ( section instanceof Float ) ? section : new Double( (double) section ).floatValue();
            case "char":
                return ( section instanceof Character ) ? section : ( (String) section ).charAt( 0 );
            default:
                return section;
        }
    }

    @Override
    public boolean supports( Class<?> type ) {
        return types.contains( type.getName() );
    }

}
