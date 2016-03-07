// Text file reader

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;

import java.util.List;

import java.io.IOException;

public class Reader {
    final static Charset ENCODING = StandardCharsets.UTF_8;

    List<String> lines;
    Parser textParser;

    public Reader(String fname) throws IOException {
        Path path = Paths.get(fname);
        lines = Files.readAllLines(path, ENCODING);

        System.out.println(" -> File is "+lines.size()+" lines long - here they are:");

        for(String line : lines) {
            System.out.println(line);
        }
    }
}
