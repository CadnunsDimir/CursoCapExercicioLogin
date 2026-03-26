package io.github.cadnunsdimir.android.exerciciologin.types

sealed class UserType {
    data object User: UserType()
    data object Admin: UserType()
}