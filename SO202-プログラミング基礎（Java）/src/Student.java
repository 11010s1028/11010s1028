// ここより下に解答を記載する。
class Student {
  static String school = "A高校";

  String name;
  String club;
  String subject;

  Student(String name, String club, String subject) {

    this.name = name;
    this.club = club;
    this.subject = subject;

  }
  
  String introduce() {
    
    String text = String.format("私の名前は%sです。\n", this.name);

    text += String.format("%sの%sに入っています。\n", school, this.club);

    text += String.format("私の好きな教科は%sです。\n", this.subject);

    return text;
  }
}
