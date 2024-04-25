package iniciante

import java.util.*
// imports para incluir
import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    """
        Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer 
        no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, 
        mostrando 4 casas decimais após a vírgula, segundo a fórmula:

        Distancia = raiz((x2 - x1)**2 + (y2 - y1)**2)

        Entrada
        O arquivo de entrada contém duas linhas de dados. A primeira linha contém 
        dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de 
        ponto flutuante x2 y2.

        Saída
        Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas 
        após o ponto decimal.
        
        1.0 7.0                  4.4721
        5.0 9.0

        
        -2.5 0.4               16.1484
        12.1 7.3

        
        2.5 -0.4               16.4575
        -12.2 7.0

      
    """.trimIndent()
    // Estas 3 linhas devem ser incluídas no beecrowd
    //val entrada = Scanner(System.`in`)
    //val entradas1 = entrada.nextLine().split(' ')
    //val entradas2 = entrada.nextLine().split(' ')

    val entradas1 = readln().split(' ')
    val entradas2 = readln().split(' ')


    val x1 = entradas1[0].toDouble()
    val y1 = entradas1[1].toDouble()

    val x2 = entradas2[0].toDouble()
    val y2 = entradas2[1].toDouble()

    val distancia = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
    val distanciaFormatted = "%.4f".format(Locale.US, distancia)

    println(distanciaFormatted)
}