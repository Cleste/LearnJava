package ch6.Stack;

/*Помимо очереди, в программах часто используется структура данных, которая
называется стеком. Обращение к стеку осуществляется по принципу "первым
пришел - последним обслужен". Стек можно сравнить со стопкой тарелок, стоящих на столе. Последней берется тарелка, поставленная на стол первой. Создайте класс Stack, реализующий стек для хранения символов. Используйте методы
push ( ) и рор () для манипулирования содержимым стека. Пользователь класса
Stack должен иметь возможность задавать размер стека при ero создании. Все
члены класса Stack, кроме методов push () и рор (), должны быть объявлены
как pri vate. (Подсказка: в качестве исходной заготовки можете воспользоваться
классом Queue, изменив в нем лишь способ доступа к данным.)*/

//ex 9_10
/*Отвечая на вопрос 3 упражнения для самопроверки по материалу главы 6, вы создали класс Stack. Добавьте в него специальные исключения, реагирующие на
попытку поместить элемент в переполненный стек и извлечь элемент из пустого
стека.*/
public class StackDemo {
    public static void main(String[] args) {
        Stack stack1 = new Stack(2);
        try {
            stack1.push('A');
            stack1.push('B');
            stack1.push('C');
        } catch (StackFullException exc) {
            System.out.println(exc);
        }
        try {
            stack1.showStack();
            System.out.println(stack1.pop());
        } catch (StackEmptyException exc) {
            System.out.println(exc);
        }

    }
}

