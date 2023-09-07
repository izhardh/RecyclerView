package com.example.recyclerview

object Constant {
    //Daftar isi recycler view
    fun defaultCharacter(): ArrayList<CharacterModel>{
        val exerciseList = ArrayList<CharacterModel>()
        val situp = CharacterModel(
            1,
            "Sit up",
        "Sit up adalah salah satu latihan otot " +
                "yang paling sering dilakukan. " +
                "Olahraga satu ini berguna untuk melatih " +
                "otot perut. Situp adalah latihan penguatan " +
                "perut yang dapat dilakukan tanpa peralatan apa pun.",
            R.drawable.ic_sit_up)
        exerciseList.add(situp)

        val pushUp = CharacterModel(
            2,
            "Push Up",
            "Push up adalah suatu jenis olahraga " +
                    "kekuatan yang berfungsi untuk melatih " +
                    "otot bisep maupun trisep. Push up adalah " +
                    "salah satu latihan sederhana yang bisa " +
                    "dilakukan di rumah tanpa memerlukan " +
                    "alat fitness yang mahal. ",
            R.drawable.ic_push_up)
        exerciseList.add(pushUp)

        val jumpingJack = CharacterModel(
            3,
            "Jumping Jacks",
            "Jumping jack adalah salah satu gerakan aerobik " +
                    "yang memiliki manfaat untuk Kesehatan " +
                    "kardiovaskular dengan menurunkan tekanan darah.",
            R.drawable.ic_jumping_jacks)
        exerciseList.add(jumpingJack)

        val plank = CharacterModel(
            4,
            "Plank",
            "Plank adalah latihan menahan berat badan" +
                    " yang melibatkan memosisikan batang tubuh " +
                    "tetap berada dalam garis lurus, selama " +
                    "kurun waktu tertentu. Plank tidak " +
                    "hanya melibatkan batang tubuh, " +
                    "melainkan juga kelompok otot yang lain," +
                    " seperti lengan, paha, dan bokong. ",
            R.drawable.ic_plank)
        exerciseList.add(plank)

        val squat = CharacterModel(
            5,
            "Squat",
            "Squat merupakan latihan yang berfungsi untuk " +
                    "mengencangkan otot tubuh, termasuk paha " +
                    "bagian dalam, pantat, kaki dan betis. " +
                    "Gerakan dalam squat juga efektif " +
                    "melancarkan sistem pencernaan.",
            R.drawable.ic_squat)
        exerciseList.add(squat)

        return exerciseList
    }
}