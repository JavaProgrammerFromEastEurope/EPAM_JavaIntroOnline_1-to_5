package chapters.chapterClasses.entitys.oop.directory;

public abstract class File {

   private String filename;
   private int size;

   public File(String filename, int size) {
      this.filename = filename;
      this.size = size;
   }

   public void setFilename(String filename) {
      this.filename = filename;
   }

   public void setSize(int size) {
      this.size = size;
   }

   public String getFilename() {
      return filename;
   }

   public int getSize() {
      return size;
   }
}