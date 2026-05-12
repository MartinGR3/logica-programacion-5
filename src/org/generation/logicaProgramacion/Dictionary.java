package org.generation.logicaProgramacion;

import java.util.HashMap;
import java.util.Map;

public class Dictionary implements DictionaryService{
    private final Map<String,String> words;

    public Dictionary(){
        words=new HashMap<>();

        words.put("hombre","man");
        words.put("mujer","woman");
        words.put("computadora","computer");
        words.put("anillo","ring");
        words.put("color","colour");
        words.put("aplicación","application");
        words.put("programa","program");
        words.put("interfaz","interface");
        words.put("perro", "dog");
        words.put("gato", "cat");
        words.put("casa", "house");
        words.put("libro", "book");
        words.put("escuela", "school");
        words.put("comida", "food");
        words.put("agua", "water");
        words.put("coche", "car");
        words.put("mesa", "table");
        words.put("silla", "chair");
        words.put("ventana", "window");
        words.put("puerta", "door");
        words.put("ciudad", "city");
        words.put("amigo", "friend");
        words.put("familia", "family");
    }

    @Override
    public Map<String, String> getWords() {
        return words;
    }
}
