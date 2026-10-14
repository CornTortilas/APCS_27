// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package pkg;

public class Cipher {
   static String[] cipher = new String[]{"9", "8", "7", "6", "5", "4", "3", "2", "1", "0", "z", "y", "x", "w", "v", "u", "t", "s", "r", "q", "p", "o", "n", "m", "l", "k", "j", "i", "h", "g", "f", "e", "d", "c", "b", "a"};
   static String[] decipher = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

   public Cipher() {
   }

   public static String encode(String var0) {
      String var1 = var0.toLowerCase();
      String var2 = "";

      for(int var3 = 0; var1.length() > 0; var1 = var1.substring(1)) {
         if (var1.substring(0, 1).equals(" ")) {
            var2 = var2 + " ";
         } else {
            for(int var4 = 0; var4 < cipher.length; ++var4) {
               if (var1.substring(0, 1).equals(cipher[var4])) {
                  var3 = var4;
                  break;
               }
            }

            var2 = var2 + decipher[var3];
         }
      }

      return var2;
   }

   public static String encode(String var0, String[] var1) {
      String var2 = var0.toLowerCase();
      String var3 = "";

      for(int var4 = 0; var2.length() > 0; var2 = var2.substring(1)) {
         if (var2.substring(0, 1).equals(" ")) {
            var3 = var3 + " ";
         } else {
            for(int var5 = 0; var5 < var1.length; ++var5) {
               if (var2.substring(0, 1).equals(var1[var5])) {
                  var4 = var5;
                  break;
               }
            }

            var3 = var3 + decipher[var4];
         }
      }

      return var3;
   }

   public static String keyedEncode(String var0, int var1) {
      String[] var2 = new String[var1];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         var2[var3] = cipher[var3];
      }

      String[] var6 = new String[cipher.length];
      int var4 = 0;

      for(var4 = 0; var4 < cipher.length - var1; ++var4) {
         var6[var4] = cipher[var4 + var1];
      }

      int var5 = 0;

      for(int var8 = var4; var8 < cipher.length; ++var8) {
         var6[var8] = var2[var5];
         ++var5;
      }

      return encode(var0, var6);
   }
}
