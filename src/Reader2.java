import javax.swing.JOptionPane;

public class Reader2 {
int i,k;
String n1,n2;
public void Scan () {
	n1 = JOptionPane.showInputDialog("Введите первое число"); // метод, который выводит на экран таблицу, в кот. будет поле ввода считает, что мы ввели и будет надпись
	n2 = JOptionPane.showInputDialog("Введите второе число");
	i= Integer.parseInt(n1);
	k= Integer.parseInt(n2);
	
}
public void Scan (int a, int b) {
	JOptionPane.showMessageDialog(null, "Теперь ваше первое число = "+a);//выводит на экран данные, подсказку, первый параметр - нал - по центру экрана, 
	JOptionPane.showMessageDialog(null, "Теперь ваше второе число = "+b);
}

}
