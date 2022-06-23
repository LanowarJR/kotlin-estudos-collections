package com.estudos.collections

import java.math.BigDecimal

// pode-se criar funcoes estendidas, nao existentes dentro da collection como os Arrays

fun Array<BigDecimal>.somatoria() = this.reduce { acc, valor -> // realiza uma somatoria dos valores bigdecimal
    acc + valor
}

fun Array<BigDecimal>.media() = // realiza uma media dos valores bigdecimals
    if (this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()
