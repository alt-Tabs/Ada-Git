// numero digitado é igual ao numero sorteado
const input = require('readline-sync')

const num_sorteado = 10

let num_digitado = Number(input.question('Escolha um numero '))

while(num_digitado != num_sorteado){
    console.log('Voce errou! tente novamente')
    num_digitado = Number(input.question('Escolha um numero '))
}
console.log('Acerto miseravi')