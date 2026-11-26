package kata_04;

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {

        String[] lines = text.split("\\n");

        StringBuilder builder = new  StringBuilder();
        for(int k = 0; k < lines.length; k++) {

            for(int i = 0; i<commentSymbols.length; i++ ){

                int index = lines[k].indexOf(commentSymbols[i]);
                if(index != -1) {
                lines[k] = lines[k].substring(0, index);
                }
            }
            if(k != lines.length - 1) {

            builder.append(lines[k].stripTrailing()).append("\n");
            } else {
            builder.append(lines[k].stripTrailing());
            }
        }

        return builder.toString();
    }

}

