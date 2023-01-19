import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;

import static java.lang.String.join;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.apache.commons.lang3.StringUtils.*;


public class UniqueWords {
    private static final String DELIMITERS = " \n\t\r.,;:!?@{}[]()*&^%$#|/.";

    public static void main(String[] args) throws IOException {
        File inputFile = new File("/Users/angelinapolishchuk/IdeaProjects/Debugging.txt");
        File outputFile = new File("/Users/angelinapolishchuk/IdeaProjects/Debugging.txt");
        String s = lowerCase(join("  ", split((FileUtils.readFileToString(new File(inputFile.toURI()), UTF_8)), DELIMITERS)));
        int j = 0;
        for (String i : new LinkedHashSet<>(List.of(split(s)))) {
            FileUtils.write(new File(outputFile.toURI()), i + "  " + countMatches(" " + s + " ", " " + i + " ") + "\n", UTF_8, true);
            j++;
        }
        FileUtils.write(new File(outputFile.toURI()), "\n" + j, UTF_8, true);
    }
}
