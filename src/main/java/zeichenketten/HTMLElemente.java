package zeichenketten;

public class HTMLElemente {
    public static String htmlElement(String tag, String body){
        if(body == null){
            body = "";
        }

        if(tag == null){
            tag = "";
        }

        if(tag.isEmpty() && body.isEmpty()){
            return "\"\"";
        }

        String tagStart = "<".concat(tag).concat(">");
        String tagEnd = "</".concat(tag).concat(">");
        return tagStart.concat(body).concat(tagEnd);
    }

    public static String strong(String body){
        return htmlElement("strong",body);
    }

    public static String emphasized(String body){
        return htmlElement("em", body);
    }

    public static void main(String[] args) {
        System.out.println(htmlElement("strong", null));
        System.out.println(strong(emphasized("strong + emphasized")));
        System.out.println(htmlElement("span", null));
        System.out.println(htmlElement("","no"));
        System.out.println(htmlElement(null, "not strong"));
        System.out.println(htmlElement(null, null));
    }
}
