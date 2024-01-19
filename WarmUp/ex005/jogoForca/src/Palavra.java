public class Palavra {
    private String palavra;
    public String[] forca(String palavra) {
        this.palavra = palavra;
        String[] output = palavra.split("");
        return output;
    }

}
