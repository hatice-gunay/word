import java.util.HashSet;
import java.util.Set;

public class TekrarliHarflerdenMetinOlustur {

    public static void main(String[] args) {
        String cumle = "En büyük savaş cahillige karşı yapılan savaştır.";

        String[] kelimeler = cumle.split("\\s+");

        String birinciKelime = null;
        String ikinciKelime = null;

        for (String kelime : kelimeler) {
            if (hasTekrarliHarf(kelime)) {
                if (birinciKelime == null) {
                    birinciKelime = kelime;
                } else {
                    ikinciKelime = kelime;
                    break;
                }
            }
        }


        String yeniMetin = birinciKelime + ikinciKelime;

        System.out.println("Tekrarlı harflerden oluşturulan metin: " + yeniMetin);
    }

    private static boolean hasTekrarliHarf(String kelime) {
        Set<Character> harfSet = new HashSet<>();

        for (char harf : kelime.toCharArray()) {
            if (!harfSet.add(harf)) {
                return true;
            }
        }

        return false;
    }
}
