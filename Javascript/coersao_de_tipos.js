// Coersão de tipos

// Coersão explicita

const num = 10
console.log(num, typeof num)

const num_string = String(num)
console.log(num_string, typeof num_string)

console.log(Number('111'))
console.log(parseFloat('255.588'))
console.log(parseInt('2558.588'))
console.log(Boolean(8)) // 0 retorna falso
console.clear()

// Coersão implicita

console.log(10+1)
console.log(10+'1') //converte tudo para string e concatena
console.log(10 - '1') //converte tudo para numero e efetua operação (*,/, % etc)
console.log(10 - 'string') //retorna NaN