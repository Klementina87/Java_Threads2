/* TODO
Imports will be filling up as you need them. */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WebPage {
    public List<String> dom; // this actually has the html document model.

    public WebPage(){
        dom = new LinkedList<>(); /* TODO
Initialize this to some kind of List */;
    }

    public void addTitle(String title){
        dom.add("<h1>" + title + "</h1>");
        /* TODO 
Add a title to the DOM*/
    }

    /* TODO
implement addParagraph that receives a String and puts it in the dom
surrounded by <p> and </p>*/
    public void addParagraph(String p) {
        dom.add("<p>" + p + "</p>");
    }

    public String toString(){
        String html = "<html>\n<head>\n</head>\n<body>";

        for (String s : dom) {
            html += s;
        }
        /* TODO
Loop through the elemments of the dom and append them to html */
        return html+"</body>\n</html>";
    }

    public void save(String filename){
        BufferedWriter bw;

        try {
            bw = new BufferedWriter(new FileWriter(filename, false));
        } catch (Exception e) {
            System.out.println("Unable to create file: " + filename);
            return;
        }

        try {
            bw.write(toString());
            bw.close();
        } catch (Exception e) {
            System.out.println("Error writing file: " + filename);
            System.out.println(e.getMessage());
        }
        /* TODO 
Save a string representation of this webpage to the filename provided.*/
    }
}
