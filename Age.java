import java.time.*;
  public class Age{  
     public static void main(String[] args) {
        LocalDate pDate=LocalDate.of(2005, 003, 8);
        LocalDate now=LocalDate.now();
        Period diff = Period.between(pDate, now);
    System.out.printf("\n I am 5d years,%d days old.\n\n, diff.getyears(),diff.getMonths(),diff.getDays()");

  }
  }