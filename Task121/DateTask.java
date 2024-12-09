package Task121;

public class DateTask {
   
   private byte day;
   private byte month;
   private short year;

  
   public DateTask() {
       day = 1;
       month = 1;
       year = 1;
   }
   
   public DateTask(int m, int d, int y) {
       setDate(m, d, y);
   }

   public String toString() {
       return String.format("%02d/%02d/%d", month, day, year);
   }

   public void setDate(int m, int d, int y) {
       if (valid(d, m, y)) {
           day = (byte) d;
           year = (short) y;
           month = (byte) m;
       } else {
           day = 0;
           year = 0;
           month = 0;
       }
   }

   public static void leapYears() {
       for (int i = 1980; i <= 2023; i = i + 4) {
           if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
               System.out.println("The year " + i + " is a leap year");
       }
   }


   public int getDay() {
       return day;
   }

  
   public void setDay(int day) {
       if (valid(day, month, year)) {
           this.day = (byte) day;
       } else {
           this.day = 0;
       }
   }

   public int getMonth() {
       return month;
   }

   public void setMonth(int month) {
       if (valid(day, month, year)) {
           this.month = (byte) month;
       } else {
           this.month = 0;
       }
   }

   public int getYear() {
       return year;
   }

   public void setYear(int year) {
       if (valid(day, month, year)) {
           this.year = (short) year;
       } else {
           this.year = 0;
       }
   }

   private boolean valid(int day, int month, int year) {
       if (day > 31 || day < 1 || month > 12 || month < 1 || year < 1)  {
           System.out.println("Attempting to create a non-valid date " + month + "/" + day + "/" + year);
           return false;
       }
       switch (month) {
           case 4:
           case 6:
           case 9:
           case 11:
               return (day <= 30);
           case 2:
               return day <= 28 || (day == 29 && year % 4 == 0);
       }
       return true;
   }
}
