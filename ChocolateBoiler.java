package Patterns.Odinochka;

//Преобразовав его в синглетную форму то есть
 //       с единственным экземпляром

public class ChocolateBoiier {

    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiier uniquelnstance;

    private ChocolateBoiier() {
        empty = true;
        boiled = false;
    }
        public static ChocolateBoiier getlnstance() {
            if (uniquelnstance == null) {
                uniquelnstance = new ChocolateBoiier();
            }
                return uniquelnstance;
            }

            public void fill(){
                if (isEmpty()) {
                    empty = false;
                    boiled = false;
// Заполнение нагревателя молочно-шоколадной смесью
                }
            }
// Остальной код ChocolateBoiier...
        }

