package matrix;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class TextAreaOutputStream extends OutputStream {

   private final JTextArea textArea;
   private final StringBuilder sb = new StringBuilder();
   private String title;

   public TextAreaOutputStream(final JTextArea textArea, String title) {
      this.textArea = textArea;
      this.title = title;
      //sb.append(title + "> ");
      this.textArea.setBackground(Color.BLACK);
      this.textArea.setDisabledTextColor(Color.GREEN);
      this.textArea.setSelectedTextColor(Color.BLUE);
      this.textArea.setFont(new Font("TimesRoman", Font.BOLD, 20));
   }

   @Override
   public void flush() {
   }

   @Override
   public void close() {
   }

   @Override
   public void write(int b) throws IOException {

      if (b == '\r')
         return;

      if (b == '\n') {
         final String text = sb.toString() + "\n";
         SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               textArea.append(text);
            }
         });
         sb.setLength(0);
         //sb.append(title + "> ");
         return;
      }

      sb.append((char) b);
   }
}