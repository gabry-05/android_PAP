package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.util.Log


class MainActivity : AppCompatActivity() {

    private val diseaseSymptomsMap: Map<String, List<String>> = mapOf(
        "COVID-19" to listOf("Febre", "Fraqueza", "Tosse", "Perda de olfato ou paladar"),
        "Gripe" to listOf("Febre", "Tosse Seca", "Dores Musculares", "Fadiga", "Congestão Nasal"),
        "Diabetes Tipo 2" to listOf("Sede Excessiva", "Fadiga", "Visão Turva", "Perda de Peso", "Urina Frequente"),
        "Asma" to listOf("Falta de ar", "Aperto no peito", "Tosse Persistente", "Chiado no peito"),
        "Resfriado Comum" to listOf("Tosse"),
        "Pneumonia" to listOf("Febre", "Tosse com expetoração", "Falta de ar", "Dor no peito ao respirar"),
        "Amigdalite" to listOf("Dor de garganta", "Amígdalad Inchadas", "Dificuldade para engolir"),
        "Apendicite" to listOf("Dor abdominal no lado inferior direito", "Vómitos", "Náuseas", "Febre", "Perda de apetite"),
        "Anemia" to listOf("Fadiga", "Palidez", "Tonturas", "Falta de ar"),
        "Depressão" to listOf("Tristeza Persistente", "Perda de interesse em atividades", "Perda de apetite", "Dificuldade para dormir ou dormir demais"),
        "Ansiedade" to listOf("Preocupação excessiva", "Irritabilidade", "Insónias", "Tensão muscular"),
        "Alzheimer" to listOf("Perda de memória", "Dificuldade para realizar tarefas familiares", "Confusão com tempos ou lugares"),
        "SIDA" to listOf("Febre", "Dor de cabeça", "Fadiga", "Gânglios inflamados no pescoço e nas virilhas"),
        "Insuficiência Cardíaca" to listOf("Falta de ar", "Inchaço nas pernas ou tornozelos", "Fadiga", "Ganho de peso rápido devido á retenção de líquidos"),
        "Colite" to listOf("Diarreia", "Febre", "Azia", "Fezes com sangue", "Náuseas"),
        "Gastroenterite" to listOf("Febre", "Vómitos", "Náuseas", "Cólicas", "Dor abdominal"),
        "Otite" to listOf("Febre", "Dor no ouvido", "Pressão no ouvido", "Tonturas", "Fadiga", "Vómitos", "Náuseas"),

    )

    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkBoxFever = findViewById<CheckBox>(R.id.checkBoxFever)
        val checkBoxWeakness = findViewById<CheckBox>(R.id.checkBoxWeakness)
        val checkBoxCough = findViewById<CheckBox>(R.id.checkBoxCough)
        val buttonDiagnose = findViewById<Button>(R.id.buttonDiagnose)
        val textViewDiagnosis = findViewById<TextView>(R.id.textViewDiagnosis)
        val checkBoxHeadache = findViewById<CheckBox>(R.id.checkBoxHeadache)
        val checkBoxNauseas = findViewById<CheckBox>(R.id.checkBoxNauseas)
        val checkBoxVomiting = findViewById<CheckBox>(R.id.checkBoxVomiting)
        val checkBoxFatigue = findViewById<CheckBox>(R.id.checkBoxFatigue)
        val checkBoxMusclePain = findViewById<CheckBox>(R.id.checkBoxMusclePain)
        val checkBoxBlurredVision = findViewById<CheckBox>(R.id.checkBoxBluerredVision)
        val checkBoxDryCough = findViewById<CheckBox>(R.id.checkBoxDryCough)
        val checkBoxChestPain = findViewById<CheckBox>(R.id.checkBoxChestPain)
        val checkBoxExcessiveThirst = findViewById<CheckBox>(R.id.checkboxExcessiveThirst)
        val checkBoxInsomnia = findViewById<CheckBox>(R.id.checkboxInsomnia)
        val checkBoxShortnessOfBreath = findViewById<CheckBox>(R.id.checkboxShortnessOfBreath)
        val checkBoxLossOfAppetite = findViewById<CheckBox>(R.id.checkboxLossOfAppetite)
        val checkBoxDarkUrine = findViewById<CheckBox>(R.id.checkboxDarkUrine)
        val checkBoxAbdominalPain = findViewById<CheckBox>(R.id.checkboxAbdominalPain)
        val checkBoxMemoryLoss = findViewById<CheckBox>(R.id.checkboxMemoryLoss)
        val checkBoxPallor = findViewById<CheckBox>(R.id.checkboxPallor)
        val checkBoxWeightLoss = findViewById<CheckBox>(R.id.checkboxWeightLoss)
        val checkBoxCongestionNasal = findViewById<CheckBox>(R.id.checkboxCongestionNasal)
        val checkBoxCramps = findViewById<CheckBox>(R.id.checkBoxCramps)
        val checkBoxFrequentUrination = findViewById<CheckBox>(R.id.checkboxFrequentUrination)
        val checkBoxDizziness = findViewById<CheckBox>(R.id.checkboxDizziness)
        val checkBoxChestTightness = findViewById<CheckBox>(R.id.checkboxChestTightness)
        val checkBoxCoughWithSputum = findViewById<CheckBox>(R.id.checkboxCoughWithSputum)
        val checkBoxChestPainWhenBreathing = findViewById<CheckBox>(R.id.checkboxChestPainWhenBreathing)
        val checkBoxLossOfSmellOrTaste = findViewById<CheckBox>(R.id.checkboxLossOfSmellOrTaste)
        val checkBoxSoreThroat = findViewById<CheckBox>(R.id.checkboxSoreThroat)
        val checkBoxSwollenTonsils = findViewById<CheckBox>(R.id.checkboxSwollenTonsils)
        val checkboxPersistentSadness = findViewById<CheckBox>(R.id.checkboxPersistentSadness)
        val checkBoxLossOfInterestActivities = findViewById<CheckBox>(R.id.checkboxLossOfInterestInActivities)
        val checkBoxDifficultySleepingOrSleepingTooMuch = findViewById<CheckBox>(R.id.checkboxDifficultySleepingOrSleepingTooMuch)
        val checkBoxAbdominalPainInTheLowerRightSide = findViewById<CheckBox>(R.id.checkboxAbdominalPainInTheLowerRightSide)
        val checkBoxChangesInAppetite = findViewById<CheckBox>(R.id.checkboxChangesInAppetite)
        val checkBoxIrritability = findViewById<CheckBox>(R.id.checkboxIrritability)
        val checkBoxExcessiveWorry = findViewById<CheckBox>(R.id.checkboxExcessiveWorry)
        val checkBoxDifficultySwallowing = findViewById<CheckBox>(R.id.checkboxDifficultySwallowing)
        val checkBoxMuscleTension = findViewById<CheckBox>(R.id.checkboxMuscleTension)
        val checkBoxHeartburn = findViewById<CheckBox>(R.id.checkboxHeartburn)
        val checkBoxDifficultyPerformingFamilyTasks = findViewById<CheckBox>(R.id.checkboxDifficultyPerformingFamilyTasks)
        val checkBoxPressureInTheEar = findViewById<CheckBox>(R.id.checkboxPressureInTheEar)
        val checkBoxConfusionWithTimeAndPlaces = findViewById<CheckBox>(R.id.checkboxConfusionWithTimeAndPlaces)
        val checkBoxPersistentCough = findViewById<CheckBox>(R.id.checkboxPersistentCough)
        val checkBoxDiarrhea = findViewById<CheckBox>(R.id.checkboxDiarrhea)
        val checkBoxBloodyStools = findViewById<CheckBox>(R.id.checkboxBloodyStools)
        val checkBoxEarPain = findViewById<CheckBox>(R.id.checkboxEarPain)
        val checkBoxWheezingInTheChest = findViewById<CheckBox>(R.id.checkboxWheezingInTheChest)
        val checkBoxSwellingInTheLegsOrAnkles = findViewById<CheckBox>(R.id.checkBoxSwellingInTheLegsOrAnkles)
        val checkBoxRapidWeightGainDueToFluidRetention = findViewById<CheckBox>(R.id.checkBoxRapidWeightGainDueToFluidRetention)
        val checkBoxSwollenGlandsInTheNeckAndGroin = findViewById<CheckBox>(R.id.checkboxSwollenGlandsInTheNeckAndGroin)

        buttonDiagnose.setOnClickListener {
            val symptoms = mutableListOf<String>()
            if (checkBoxFever.isChecked) symptoms.add("Febre")
            if (checkBoxWeakness.isChecked) symptoms.add("Fraqueza")
            if (checkBoxCough.isChecked) symptoms.add("Tosse")
            if (checkBoxHeadache.isChecked) symptoms.add("Dor de Cabeça")
            if (checkBoxNauseas.isChecked) symptoms.add("Náuseas")
            if (checkBoxVomiting.isChecked) symptoms.add("Vómitos")
            if (checkBoxFatigue.isChecked) symptoms.add("Fadiga")
            if (checkBoxMusclePain.isChecked) symptoms.add("Dores Musculares")
            if (checkBoxBlurredVision.isChecked) symptoms.add("Visão Turva")
            if (checkBoxDryCough.isChecked) symptoms.add("Tosse Seca")
            if (checkBoxChestPain.isChecked) symptoms.add("Dor no peito")
            if (checkBoxExcessiveThirst.isChecked) symptoms.add("Sede excessiva")
            if (checkBoxInsomnia.isChecked) symptoms.add("Insónias")
            if (checkBoxShortnessOfBreath.isChecked) symptoms.add("Falta de ar")
            if (checkBoxLossOfAppetite.isChecked) symptoms.add("Perda de Apetite")
            if (checkBoxDarkUrine.isChecked) symptoms.add("Urina Escura")
            if (checkBoxAbdominalPain.isChecked) symptoms.add("Dor abdominal")
            if (checkBoxMemoryLoss.isChecked) symptoms.add("Perda de memória")
            if (checkBoxPallor.isChecked) symptoms.add("Palidez")
            if (checkBoxWeightLoss.isChecked) symptoms.add("Perda de peso")
            if (checkBoxCongestionNasal.isChecked) symptoms.add("Congestão Nasal")
            if (checkBoxCramps.isChecked) symptoms.add("Cólicas")
            if (checkBoxFrequentUrination.isChecked) symptoms.add("Urinação Frequente")
            if (checkBoxDizziness.isChecked) symptoms.add("Tonturas")
            if (checkBoxChestTightness.isChecked) symptoms.add("Aperto no peito")
            if (checkBoxCoughWithSputum.isChecked) symptoms.add("Tosse com Expectoração")
            if (checkBoxChestPainWhenBreathing.isChecked) symptoms.add("Dor no peito ao respirar")
            if (checkBoxLossOfSmellOrTaste.isChecked) symptoms.add("Perda do olfato ou paladar")
            if (checkBoxSoreThroat.isChecked) symptoms.add("Dor de garganta")
            if (checkBoxSwollenTonsils.isChecked) symptoms.add("Amígdalas Inchadas")
            if (checkBoxDifficultySwallowing.isChecked) symptoms.add("Dificuldade para engolir")
            if (checkboxPersistentSadness.isChecked) symptoms.add("Tristeza Persistente")
            if (checkBoxLossOfInterestActivities.isChecked) symptoms.add("Perda de interesse em atividades")
            if (checkBoxDifficultySleepingOrSleepingTooMuch.isChecked) symptoms.add("Dificuldade para dormir ou dormir demais")
            if (checkBoxAbdominalPainInTheLowerRightSide.isChecked) symptoms.add("Dor Abdominal no lado inferior direito")
            if (checkBoxChangesInAppetite.isChecked) symptoms.add("Alterações no apetite")
            if (checkBoxIrritability.isChecked) symptoms.add("Irritabilidade")
            if (checkBoxExcessiveWorry.isChecked) symptoms.add("Preocupação Excessiva")
            if (checkBoxMuscleTension.isChecked) symptoms.add("Tensão Muscular")
            if (checkBoxDifficultyPerformingFamilyTasks.isChecked) symptoms.add("Dificuldade para realizar tarefas familiares")
            if (checkBoxConfusionWithTimeAndPlaces.isChecked) symptoms.add("Confusão com tempos ou lugares")
            if (checkBoxBloodyStools.isChecked) symptoms.add("Fezes com sangue")
            if (checkBoxHeartburn.isChecked) symptoms.add("Azia")
            if (checkBoxPressureInTheEar.isChecked) symptoms.add("Pressão no ouvido")
            if (checkBoxEarPain.isChecked) symptoms.add("Dor no ouvido")
            if (checkBoxPersistentCough.isChecked) symptoms.add("Tosse persistente")
            if (checkBoxDiarrhea.isChecked) symptoms.add("Diarreia")
            if (checkBoxWheezingInTheChest.isChecked) symptoms.add("Chiado no peito")
            if (checkBoxSwellingInTheLegsOrAnkles.isChecked) symptoms.add("Inchaço nas pernas ou tornozelos")
            if (checkBoxRapidWeightGainDueToFluidRetention.isChecked) symptoms.add("Ganho de peso rápido devido à retenção de líquidos")
            if (checkBoxSwollenGlandsInTheNeckAndGroin.isChecked) symptoms.add("Gânglios Inflamados no pescoço e nas virilhas")

            val diagnosis = getDiagnosis(symptoms)
            textViewDiagnosis.text = diagnosis
        }
    }

    private fun getDiagnosis(symptoms: List<String>): String {

        if (symptoms.size < 2) {
            return "Sintomas insuficientes para um diagnóstico"
        }


        for ((disease, requiredSymptoms) in diseaseSymptomsMap) {
            val matchingSymptomsCount = requiredSymptoms.count {
                it.lowercase().trim() in symptoms.map { symptom -> symptom.lowercase().trim() }
            }


            Log.d("Diagnosis", "Doença: $disease, Sintomas necessários: $requiredSymptoms, Sintomas fornecidos: $symptoms, Coincidências: $matchingSymptomsCount")


            if (matchingSymptomsCount >= 2) {
                return disease
            }
        }


        return "Sintomas não suficientes para um pré-diagnóstico"
    }
}



