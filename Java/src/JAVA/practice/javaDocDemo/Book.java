/**
 * @author Mrityunjay
 * @version 2.1
 * @since 05-09-2022
 * **/

package Java.practice.javaDocDemo;

/**
 * This class is for library book
 */

public class Book {

    /**
     * @value 10 default value
     */
    static int val = 10;

    /**
     * Parametrise Constructor
     * @param s Book Name
     */
    public Book ( String s ) {
    }

    /**
     * Issues a book to a student
     * @param roll rollno of a student
     * @throws Exception if book is not availabe the throws user define exception
     */
    public void issue ( int roll ) throws Exception {
    }

    /**
     * Check if book is available
     * @param str Book name
     * @return return true or false if book is there or not
     */
    public boolean available ( String str ) {
        return true ;
    }

    /**
     * get book name
     * @param id Book Id
     * @return returns book name
     */
    public String getName ( int id ) {
        return "" ;
    }
}
