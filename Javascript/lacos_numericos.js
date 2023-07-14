const input = require('readline-sync')

// calcular media
// let media = (n1 + n2 + n3)/3

// Acumulador
let c = 0
c = c + 10
c+=2
c++
console.log(c)
console.clear()


// for
for (let i = 0; i<3; i++){
    console.log(i)
}

for (let i = 12; i> 8; i--){
    console.log(i)
}
console.clear()

// media com for
let nota
let soma = 0

for (let i = 1; i<=3; i++){
    nota = Number(input.question(`Informe a nota ${i} do aluno: `))
    soma = soma+nota
    // console.log(soma,i)
}
console.log(`A media do aluno é ${soma/3}`)