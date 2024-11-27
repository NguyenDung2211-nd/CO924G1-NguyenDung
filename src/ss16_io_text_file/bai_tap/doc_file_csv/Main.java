package ss16_io_text_file.bai_tap.doc_file_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("src/ss16_io_text_file/bai_tap/doc_file_csv/countries.csv"));

            while ((line = br.readLine()) != null) {
                List<String> data = parseCsvLine(line);
                Country country = convertToCountry(data);
                printCountry(country);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (String data : splitData) {
                result.add(data);
            }
        }
        return result;
    }

    private static Country convertToCountry(List<String> data) {
        if (data.size() == 3) {
            int id = Integer.parseInt(data.get(0));
            String code = data.get(1);
            String name = data.get(2);
            return new Country(id, code, name);
        }
        return null;
    }

    private static void printCountry(Country country) {
        if (country != null) {
            System.out.println(
                    "Country (id = " + country.getId() + ", code = " + country.getCode() + ", name = " + country.getName() + ")");
        }
    }
}
