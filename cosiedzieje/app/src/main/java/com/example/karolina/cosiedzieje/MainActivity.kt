package com.example.karolina.cojarobie

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.karolina.cosiedzieje.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView (R.layout.activity_main)


        zad1()

        zad2()

        zad3()

// Policz ile razy w talicy wystepuja azwy domow z HP

        zad4()

// Sprawdz na której liscie jest wiecej uśmiechów 1 cczy 2 i wypisz jej nazwe na ekran łącznie z ilością


        zad5()
// Sprawdz na której liscie jest wiecej uśmiechów 1 cczy 2 i wypisz jej nazwe na ekran łącznie z ilością

        zad6()
// Zamien w stringu wszystkie a na e, nastepnie podziel string po znakach , i ; i wypisz do result co drugi apis

        zad7()
        zad8()

        // Policz ile razy w talicy wystepuja azwy domow z HP

        zad9()
// Sprawdz na której liscie jest wiecej uśmiechów 1 cczy 2 i wypisz jej nazwe na ekran łącznie z ilością

        zad9()
// Zamien w stringu wszystkie a na e, nastepnie podziel string po znakach , i ; i wypisz do result co drugi apis


        zad10()
// utwórz dwie tablice jedna niech zawiera różne napisy ze spacjami i średnikami,


        zad11()

// zad 1

        zad12()
        //zad 2

        zad13()
        // zad 3 przekopiuj dowoly cytat z ksiazki jakis dlugi. wylicz w programie ile ma zda potem


        zad14()
        // zad 6 zainicjalizuj tablice Intow. Oblicz sume wszystkich elementów w tablicy


        zad15()
        // zad7 Nagroda


        zad16()
        //zad 2

        zad17()

    }

    private fun zad3() {
        val A = arrayListOf<String>("a", "c", "d", "e", "k", "o")
        val C = "Ala ma kota"
        val d = A[0]
        A[2] = "l"
        var e = C + A[3]
        e = ""
        for (i in A) {
            if (C == i) {
                val e = "tak"
            }
        }
    }

    private fun zad2() {
        val w = 72
        val h = 1.72
        //val bmi = w/(sqrt(h.toDouble()))
        val bmi = bmi(w, h)
        //tekst.text = "BMI = " + bmi.toString()
    }

    private fun bmi(w: Int, h: Double) = w / (h * h)



    private fun zad1() {
        val a = "hej"
        val c = "Sylwia"
        val napis = a + " " + c
        // tekst.text = napis
    }

    private fun zad17() {
        val licz = arrayListOf<Int>(2, 5, 7, 15, 34, 35)
        val wartosci = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40)
        for (i in wartosci) {
            val rand = List(6) { Random().nextInt(i) }.sorted()
            var traf = ""
            val traf2 = "Wylosowane liczby to: " + rand.toString() + "Trafione liczby: "
            for (ele in licz) {
                for (ele2 in rand) {
                    if (ele.equals(ele2)) {
                        traf += ele.toString() + traf
                    }
                }

            }
            //  tekst.text = traf2 + traf
        }
    }

    private fun zad16() {
        val prize = arrayListOf<String>("KoA", "Deserek", "Doctor Who", "Kino", "Spacer", "Wycieczka", "Piwo z laskami", "Spiż")
        var myprize = ""
        val prizes = prize.size - 1
        for (i in prize.indices) {
            val random = Random().nextInt(prizes) + 1
            myprize = prize[random]
        }
        //tekst.text = "Moją nagrodą jest " + myprize
    }

// nastepnie wylosuj 6 liczb wykorzystujac funkcje random. Sprawdz ile liczb trafiles i wypisz je na ekran
//Utworz symulator lotto. stworz tablice która bedzie zawierala twoje 6 wytypowanych liczb,
//wypisz a ekra losowe zdaie
// nastepnie wylosuj 6 liczb wykorzystujac funkcje random. Sprawdz ile liczb trafiles i wypisz je na ekran
//Utworz symulator lotto. stworz tablice która bedzie zawierala twoje 6 wytypowanych liczb,
// usun wszystkie "nie" i podwójne spacje wynik wyswietl na ekranie
//Dla strina "Nie   umiem   programowac, nIe poradze sobie, nie dla   mnie"
// po oddzieleniu ich po średnikach plus kolor z drugiej,
// druga niech zawiera kolory oddzielone dużym X.Wypisz na ekran pare z pierwszej tablicy
// po oddzieleniu ich po średnikach plus kolor z drugiej,
// druga niech zawiera kolory oddzielone dużym X.Wypisz na ekran pare z pierwszej tablicy
// utwórz dwie tablice jedna niech zawiera różne napisy ze spacjami i średnikami,


    private fun zad15() {
        val liczby = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val suma = liczby.sum()
        // tekst.text = suma.toString()
    }

    private fun zad14() {
        val ksiazka = "THE BOY WHO LIVED Mr. and Mrs. Dursley, of number four, Privet Drive, " +
                "were proud to say that they were perfectly normal, thank you very much. " +
                "They were the last people you'd expect to be involved in anything strange or mysterious, " +
                "because they just didn't hold with such nonsense. Mr. Dursley was the director of a firm " +
                "called Grunnings, which made drills. He was a big, beefy man with hardly any neck," +
                " although he did have a very large mustache. Mrs. Dursley was thin and blonde " +
                "and had nearly twice the usual amount of neck, which came in very useful as she " +
                "spent so much of her time craning over garden fences, spying on the neighbors. " +
                "The Dursleys had a small son called Dudley and in their opinion there was no finer boy anywhere."
        val oldValue = "Mr."
        val oldValue2 = "Mrs."
        val newValue = "Mr"
        val newValue2 = "Mrs"
        val ksiazka2 = ksiazka.replace(oldValue, newValue)
        val ksiazka3 = ksiazka2.replace(oldValue2, newValue2)
        val ksiazka4 = ksiazka3.replace(".", ".<")
        val zdania = ksiazka4.split("<")
        val liczbazdan = zdania.size - 1
        var zdanie = ""
        for (i in zdania.indices) {
            val random = Random().nextInt(liczbazdan) + 1
            zdanie = zdania[random]
        }
        lol.text = zdanie

        // zad 4 sprawdz ile slow ma wylosowane zdanie i wypisz na ekran przedostatnie slowo
        // zad 5 dodaj obsluge kiedy zdanie ma tylko jedno slowo wtedy nie wypisuj nic
        /* val slowa = zdanie.split(" ")
         val liczbaslow = slowa.size - 1
         var slowo = ""
         for (i in slowa.indices) {
             slowo = slowa[liczbaslow - 1]
             if (liczbaslow == 1) {
                 tekst.text = "Zdan w tekście jest " + liczbazdan.toString() + " Losowe zdanie to: " + zdanie + " Zdanie ma " + liczbaslow.toString() + " słowo."
             } else {
                 tekst.text = "Zdan w tekście jest " + liczbazdan.toString() + " Losowe zdanie to: " + zdanie + " Zdanie ma " + liczbaslow.toString() + " slów" + " Przedostatnie słowo to: " + slowo
             }
         }*/
    }

    private fun zad13() {
        val licz = arrayListOf<Int>(2, 5, 7, 15, 34, 35)
        val rand = List(6) { Random().nextInt(41 - 1) }
        var traf = ""
        val traf2 = "Wylosowane liczby to: " + rand.toString() + "Trafione liczby: "
        for (ele in licz) {
            for (ele2 in rand) {
                if (ele.equals(ele2)) {
                    traf += ele.toString() + traf
                }
            }

        }
        // ie umiem zrobic tak, by wylosowane numery sie nie powtarzaly
        // i by wyszukiwalo po calych numerach a nie czesciach - ok, to wiem


        // tekst.text = traf2 + traf
    }

    private fun zad12() {
        val napis = "Nie   umiem   programowac, nIe poradze sobie, nie dla   mnie"
        var halo = napis.replace("nie ", "", true)
        val halo2 = halo.replace("  ", " ", false)
    }

    private fun zad11() {
        val lista1 = "fguhdf dgj dfkju;dghi grdgt;fdgi;dfh dhji gfrgtf;d f;d"
        val lista2 = "redXblueXgreenXyellowXblackXwhite"
        val list1 = lista1.split(";", " ")
        val list2 = lista2.split("X")
        var halo = ""
        for (eleme in list1) {
            for (ele in list2) {
                halo = list1[2] + " " + list1[5] + " " + list1[6] + " " + list2[3]
            }
        }
    }

    private fun zad10() {
        val string = "asdfghj,asdfgh,asddf; dsfs,df.df"
        val string2 = string.replace("a", "e", true)
        val ta = string2.split(",", ";")
        var halo = ""
        for (index in ta.indices step 2) {
            halo = halo.toString() + " " + ta[index]
        }
    }

    private fun zad9() {
        val tab1 = arrayListOf<String>(":)", "sdas", "sadsadsa", ":)", ":(", ":*", "sdfdasf")
        val tab2 = arrayListOf<String>(":D", "sdaASDASDAs", "sada", ":D", ":(", ":*gg", "XD")
        val emoty = arrayListOf<String>(":)", ":(", ":*", ":D", "XD")
        var tabl1 = 0
        var tabl2 = 0
        var halo = ""
        for (emota in emoty) {
            for (element in tab1) {

                if (element == emota) {
                    tabl1 += 1
                }
            }
        }
        for (emota in emoty) {
            for (element2 in tab2) {

                if (element2 == emota) {
                    tabl2 += 1
                }
            }
        }
        if (tabl1 > tabl2) {
            halo = "tab1 " + tabl1.toString()
        } else if (tabl2 > tabl1) {
            halo = "tab2 " + tabl2.toString()
        } else {
            halo = "maja tyle samo czyli " + tabl2.toString()
        }
    }

    private fun zad18() {
        val tab = arrayListOf<String>("test", "gryffindor", "Gryffindor", "Slytherin", "SlYtHeRin", "juz widze twoja mine :D", "trydno dasz rade")
        val domy = arrayListOf<String>("gryffindor", "slytherin")
        var ilosc = 0

        for (element in tab) {
            if (domy.contains(element.toLowerCase())) {
                ilosc += 1
            }
        }
    }

    private fun zad8() {
        val lista1 = "fguhdf dgj dfkju;dghi grdgt;fdgi;dfh dhji gfrgtf;d f;d"
        val lista2 = "redXblueXgreenXyellowXblackXwhite"
        var pokaz = ""
        val tablica1 = lista1.split(" ", ";")
        val tablica2 = lista2.split("X")
        for (element in tablica1) {
            for (index2 in tablica2) {
                pokaz = tablica1[2] + tablica1[5] + tablica1[9] + " " + tablica2[4]
            }
        }


        //  tekst.text = pokaz
    }

    private fun zad7() {
        val string = "asdfghj,asdfgh,asddf; dsfs,df.df"
        val string2 = string.replace("a", "e", true)
        val tab = string2.split(",", ";")
        var wynik = ""
        for (index in tab.indices step 2) {
            //result = result + tab[index] }
            for (element in tab) {
                for (znak in element.indices step 2) {
                    wynik = wynik + element[znak]
                }
            }
        }
    }

    private fun zad6() {
        val tab1 = arrayListOf<String>(":)", "sdas", "sadsadsa", ":)", ":(", ":*", "sdfdasf", ":)")
        val tab2 = arrayListOf<String>(":D", "sdaASDASDAs", "da", ":D", ":(", ":*", "XD")
        val emoty = arrayListOf<String>(":)", ":(", ":*", ":D", "XD")
        var suma1 = 0
        var suma2 = 0
        var result = ""
        for (element in tab1) {
            for (element1 in emoty)
                if (element == element1) {
                    suma1 += 1
                }
        }
        for (element in tab2) {
            for (element2 in emoty)
                if (element == element2) {
                    suma2 += 1
                }
        }
        if (suma1 > suma2) {
            result = "suma1 " + suma1.toString()
        } else if (suma2 > suma1) {
            result = "suma2 " + suma2.toString()
        } else {
            result = "obioe tablice zawierają taką samą ilość emotikon " + suma1.toString()
        }
    }

    private fun zad5() {
        val tab1 = arrayListOf<String>(":)", "sdas", "sadsadsa", ":)", ":(", ":*", "sdfdasf")
        val tab2 = arrayListOf<String>(":D", "sdaASDASDAs", "sada", ":D", ":(", ":*", ":D")
        var suma1 = 0
        var suma2 = 0
        var result = ""
        for (element in tab1) {
            if (element.length == 2) {
                suma1 += 1
            }
        }
        for (element in tab2) {
            if (element.length == 2) {
                suma2 += 1
            }
        }

        if (suma1 > suma2) {
            result = "suma1" + suma1.toString()
        } else {
            result = "suma2" + suma2.toString()
        }




        //  tekst.text = result
    }

    private fun zad4() {
        val tab = arrayListOf<String>("test", "gryffindor", "Gryffindor", "Slytherin", "SlYtHeRin", "juz widze twoja mine :D", "trydno dasz rade")
        val domy = arrayListOf<String>("gryffindor", "slytherin")
        domy.forEach {
            it.toUpperCase()
        }
        var suma = 0
        for (element in tab) {
            if (domy.contains(element.toLowerCase())) {
                suma += 1
            }

        }



    }

}

