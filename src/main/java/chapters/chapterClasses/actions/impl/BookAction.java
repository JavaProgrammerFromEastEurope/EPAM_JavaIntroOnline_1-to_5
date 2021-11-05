package chapters.chapterClasses.actions.impl;

import chapters.chapterClasses.actions.IClassAction;
import chapters.chapterClasses.entitys.common.book.Book;
import chapters.chapterClasses.entitys.common.book.BookCollection;

import java.text.MessageFormat;

import static java.lang.System.out;

public class BookAction implements IClassAction {

    BookCollection bookCollection;

    @Override
    public void inputVariables() {
        bookCollection = new BookCollection();

        bookCollection.getBookList()
                .add(new Book("Weisskopf J.", "Microsoft FrontPage",
                        "Piter", 2000, 423,
                        "7bc", 352, 53));

        bookCollection.getBookList()
                .add(new Book("Weiskas J.", "Working effectively with Microsoft Access",
                        "Piter", 2000, 645,
                        "7b", 1040, 165));

        bookCollection.getBookList()
                .add(new Book("Dyakonov V.", "Internet. User's Handbook",
                        "Solon-R", 2000, 344,
                        "kbc", 640, 65));

        bookCollection.getBookList()
                .add(new Book("Kirsanov D.", "Understandable Internet",
                        "Plus Symbol", 1996, 252,
                        "Stapling", 252, 34));

        bookCollection.getBookList()
                .add(new Book("Ponomarenko S.", "CorelDRAW 9",
                        "BHV-St.Petersburg", 1999, 560,
                        "Spring mount", 560, 49));

        bookCollection.getBookList()
                .add(new Book("Straznickas M.", "Photoshop 5. Graphics for the Web.",
                        "Piter", 2000, 480,
                        "French", 480, 68));

        bookCollection.getBookList()
                .add(new Book("Hobbs L.", "Internet home pages",
                        "Fenix", 1998, 160,
                        "Typographic", 160, 13));
    }

    @Override
    public void printResult() {
                addString[0] = "Weiskas J.";
            out.print(MessageFormat.format("%n Show books with author {0}:", addString[0]));
        BookCollection.printBooksByParameter(bookCollection.getBookList(), true, addString[0]);

                addString[0] = "Piter";
            out.print(MessageFormat.format("%n Show books with publisher {0}:", addString[0]));
        BookCollection.printBooksByParameter(bookCollection.getBookList(), false, addString[0]);

                addString[0] = "2000";
        out.print(MessageFormat.format("%n Show books with publisher year {0}:", addString[0]));
        BookCollection.printBooksByYear(bookCollection.getBookList(), Integer.parseInt(addString[0]));
    }
}