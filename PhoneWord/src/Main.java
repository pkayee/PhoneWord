///
///
///  Name : Patrick Kiernan
///  id : 30140770
///  Date : 13/02/26
///
///






import Packages.Storage;

void main() {

    Storage Strings = new Storage();
    String outputString = "";

    var userInput = IO.readln("Enter String Number! \n");
    String[] stringChars = userInput.split(""); // splits user input chars into string array


    // iterates through table of chars and matches it to strings in storage
    for (int i = 0; i < userInput.length(); i++ ) {
         if (Strings.nums[2].indexOf(stringChars[i], 0) != -1 ) {
             outputString += "2";

         } else if (Strings.nums[3].indexOf(stringChars[i], 0) != -1) {
             outputString += "3";

         } else if (Strings.nums[4].indexOf(stringChars[i], 0) != -1) {
             outputString += "4";

         } else if (Strings.nums[5].indexOf(stringChars[i], 0) != -1) {
             outputString += "5";

         } else if (Strings.nums[6].indexOf(stringChars[i], 0) != -1) {
             outputString += "6";

         } else if (Strings.nums[7].indexOf(stringChars[i], 0) != -1) {
             outputString += "7";

         } else if (Strings.nums[8].indexOf(stringChars[i], 0) != -1) {
             outputString += "8";

         } else if (Strings.nums[9].indexOf(stringChars[i], 0) != -1) {
             outputString += "9";


         } try {
             int stringAsInt = Integer.parseInt(stringChars[i]);
             outputString += stringChars[i];
         } catch (Exception e) {
         }
    }
    IO.println(outputString);

}
