package ru.mephi.sno.flow

/**
 * Экземпляры классов, помеченных этой аннотацией, могут изменяться по ходу выполнения графа
 * (без возвращения в контекст)
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
annotation class Mutable
