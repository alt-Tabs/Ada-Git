
function sayHello(){
    console.log('Hello')
}

sayHello()
console.clear()

// Como enviar parametros para as funçoes
function sayHello(nome){
    console.log(`Hello ${nome}`)
}
sayHello('Baka')

function soma(a,b){
    return a+b
}
const resultado = soma(10,20)
console.log(resultado)
console.log(resultado/2)
console.clear()

function maiorDoQueSe(num){
    if(num >50){
        return true
    }
    return false
}