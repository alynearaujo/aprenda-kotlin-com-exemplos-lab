// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel = Nivel.BASICO)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} matriculado na formação $nome")
    }
}

fun main() {
    // Criando alguns conteúdos educacionais com diferentes níveis de dificuldade
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 45, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", 60, Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional("Desenvolvimento Android", 90, Nivel.DIFICIL)

    // Criando uma formação com esses conteúdos
    val formacaoKotlin = Formacao("Formação Kotlin", listOf(conteudo1, conteudo2, conteudo3))

    // Criando alguns usuários
    val usuario1 = Usuario("Amanda")
    val usuario2 = Usuario("Tânia")
    val usuario3 = Usuario("Carol")

    // Matriculando os usuários na formação
    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)
    formacaoKotlin.matricular(usuario3)

    // Verificando os inscritos na formação
    println("Inscritos na formação ${formacaoKotlin.nome}:")
    for (inscrito in formacaoKotlin.inscritos) {
        println(inscrito.nome)
    }

    // Teste do nível de dificuldade dos conteúdos
    println("\nNível de dificuldade dos conteúdos:")
    for (conteudo in formacaoKotlin.conteudos) {
        println("${conteudo.nome}: ${conteudo.nivel}")
    }
}
