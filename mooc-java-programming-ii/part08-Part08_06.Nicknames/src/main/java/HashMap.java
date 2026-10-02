public class HashMap {

    public static void main(String[] args) {
       java.util.HashMap<String, String> nicknames = new java.util.HashMap<>();

        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        System.out.println(nicknames.get("matthew"));
    }
}