public class StringExamples {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(5);
        stringBuffer.append("5256.87675698744");
        stringBuffer.append(54.36552);
        stringBuffer.append(654.22523f);
        stringBuffer.append(" helllo ");
        stringBuffer.setLength(40);

        System.out.println(stringBuffer.capacity()+" "+stringBuffer);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("52345678901233456");
        System.out.println(stringBuilder.capacity()+" "+stringBuilder);


    }
}
