package Annotation;

import java.time.LocalDateTime;

public class Annotation {
    public static void main(String[] args) throws IllegalAccessException {
        SuperMan superMan = new SuperMan(); // Tao doi tuong super man
        superMan.setDateOfBirth(LocalDateTime.now());
        superMan.setName("loda");

        String json =JsonNameProcessor.toJson(superMan);
        System.out.println(json);
    }
    // OUTPUT:
    /*
    {
        "super_man": {
            "name": "loda",
            "date_of_birth": "2019-04-03T21:07:23.983"
        }
    }
    */
}
