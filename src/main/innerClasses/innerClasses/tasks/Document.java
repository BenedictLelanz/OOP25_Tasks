package main.innerClasses.innerClasses.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Document {

    private final String title;

    private final String author;

    private final List<Paragraph> paragraphs;

    Document(String title, String author) {
        this.title = title;
        this.author = author;
        this.paragraphs = new ArrayList<>();

        MetadataValidator.checkMetadata(this);
    }

    void printDoc() {
        System.out.println(this.title);
        System.out.println();

        Collections.sort(paragraphs, new Comparator<Paragraph>() {

            @Override
            public int compare(Paragraph o1, Paragraph o2) {
                return Integer.compare(o1.getNum(), o2.getNum());
            }

        });

        for (Paragraph p : this.paragraphs) {
            System.out.println(p.text);
        }
    }

    void createParagraph(String text, int i) {
        new Paragraph(i, text);
    }

    static class MetadataValidator {

        static void checkMetadata(Document document) {
            if (document.title == null || document.author == null)
                throw new IllegalArgumentException("title or \" author null");
            if (document.title.length() > 20 || document.title.length() < 2)
                throw new IllegalArgumentException("Title has wrong length");
            if (document.author.length() > 20 || document.author.length() < 2)
                throw new IllegalArgumentException("Author name has wrong length");
        }

    }

    class Paragraph {

        private int num;

        private final String text;

        Paragraph(int num, String text) {
            this.num = num;
            this.text = text;
            Document.this.paragraphs.add(this);
        }

        int getNum() {
            return this.num;
        }

        int getSize() {
            return text.length();
        }

        void changeNum(int n) {
            this.num = n;
        }

        @Override
        public String toString() {
            return "Paragraph[n: " + this.num + ", text: " + this.text + "]";
        }

    }
    
}
