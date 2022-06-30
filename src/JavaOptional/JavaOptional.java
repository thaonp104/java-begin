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

        // ifPresent
        optional.ifPresent(s -> System.out.println(s)); // s - doi tuong truyen vao optional
        System.out.println();

        // orElse and orElseGet
        String orElse = null;
        Optional<String> optionalOrElse = Optional.ofNullable(orElse);
        String resultOrElse = optionalOrElse.orElse("Gia tri mac dinh - OrElse");
        System.out.println(resultOrElse);
        String orElseGet = null;
        Optional<String> optionalOrElseGet = Optional.ofNullable(orElseGet);
        String resultOrElseGet = optionalOrElseGet.orElseGet(() -> {
            StringBuilder sb = new StringBuilder("Gia tri mac dinh - OrElseGet");
            // Thao tác phức tạp
            return sb.toString();
        });
        System.out.println(resultOrElseGet);
        System.out.println();

        // map
        Outfit outfit = new Outfit();
        Girl girl = new Girl(outfit);
        String map = getOutfitType(girl);
        System.out.println(map);

        // filter
        outfit.setType("Shirt");
        Girl girl1 = new Girl(outfit);
        String filter = getOutfitTypeUseFilter(girl1);
        System.out.println(filter);
    }

    public static String getOutfitType(Girl girl){
        return Optional.ofNullable(girl) // Tạo ra Optional wrap lấy girl
                .map(Girl::getOutfit) // nếu girl != null thì lấy outfit ra xem kakaka :3 ngược lại trả ra Optional.empty()
                .map(Outfit::getType) // nếu outfit != null thì lấy ra xem type của nó
                .orElse("Không mặc gì"); // Nếu cuối cùng là Optional.empty() thì trả ra ngoài Không mặc gì.
    }

    public static String getOutfitTypeUseFilter(Girl girl){
        return Optional.ofNullable(girl) // Tạo ra Optional wrap lấy girl
                .map(Girl::getOutfit) // nếu girl != null thì lấy outfit ra xem kakaka :3 ngược lại trả ra Optional.empty()
                .map(Outfit::getType) // nếu outfit != null thì lấy ra xem type của nó
                .filter(s -> s.contains("Shirt")) // Nó chỉ chấp nhận giá trị bikini, còn lại dù khác null thì vẫn trả ra ngoài là Optiional.empty()
                .orElse("Không mặc gì"); // Nếu cuối cùng là Optional.empty() thì trả ra ngoài Không mặc gì.
    }
}
