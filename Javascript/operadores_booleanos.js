// igualdade    == ou ===
// desigualdade !=
// maior que    >
// maior ou igual que   >=
// menor que    <
// menor ou igual que   <=

const numero = 10

console.log(numero == 10)
console.log(numero > 20)

console.log(numero == '10')
console.log(numero === '10')

console.clear()

console.log(numero != '10')
console.log(numero !== '10')

// Conjunções lógicas

// and => &&
idade = 29
possuiCnh = false

const possoDirigir = idade>= 18 && possuiCnh === true
console.log('Posso dirigir? ', possoDirigir)

//  OR => ||
idade = 40

const votoFacultativo = idade<18 || idade>=70
console.log('Voto facultativo? ', votoFacultativo)

// not => !
const gosteiDoCurso = false
console.log('Gostou do curso? ', !gosteiDoCurso)

