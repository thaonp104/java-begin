package JavaOptional;

import java.util.Optional;

public class JavaOptional {
    public static void main(String[] args) {
        String str = "String Test";
        Optional<String> optional = Optional.ofNullable(str);

        System.out.println(optional);

        if (optional.isPresent()) {
            System.out.println("Str is not null");
        }

        optional.ifPresent(s -> System.out.println(s)); // s - doi tuong truyen vao optional
        System.out.println();

        String orElse = null;
        Optional<String> optionalOrElse = Optional.ofNullable(orElse);
        String resultOrElse = optionalOrElse.orElse("Gia tri mac dinh - OrElse");
        System.out.println(resultOrElse);
    }
}
