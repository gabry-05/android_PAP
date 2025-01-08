package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
        val checkBoxMuscleTension = findViewById<CheckBox>(R.id.checkboxMuscleTension)
        val checkBoxDifficultyPerformingFamilyTasks = findViewById<CheckBox>(R.id.checkboxDifficultyPerformingFamilyTasks)


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
            if (checkBoxCramps.isChecked) symptoms.add("Cãimbras")
            if (checkBoxFrequentUrination.isChecked) symptoms.add("Urinação Frequente")
            if (checkBoxDizziness.isChecked) symptoms.add("Tonturas")
            if (checkBoxChestTightness.isChecked) symptoms.add("Aperto no peito")
            if (checkBoxCoughWithSputum.isChecked) symptoms.add("Tosse com Expectoração")
            if (checkBoxChestPainWhenBreathing.isChecked) symptoms.add("Dor no peito ao respirar")
            if (checkBoxLossOfSmellOrTaste.isChecked) symptoms.add("Perda do olfato ou paladar")
            if (checkBoxSoreThroat.isChecked) symptoms.add("Dor de garganta")
            if (checkBoxSwollenTonsils.isChecked) symptoms.add("Amígdalas Inchadas")
            if (checkboxPersistentSadness.isChecked) symptoms.add("Tristeza Persistente")
            if (checkBoxLossOfInterestActivities.isChecked) symptoms.add("Perda de interesse em atividades")
            if (checkBoxDifficultySleepingOrSleepingTooMuch.isChecked) symptoms.add("Dificuldade para dormir ou dormir demais")
            if (checkBoxAbdominalPainInTheLowerRightSide.isChecked) symptoms.add("Dor Abdominal no lado inferior direito")
            if (checkBoxChangesInAppetite.isChecked) symptoms.add("Alterações no apetite")
            if (checkBoxIrritability.isChecked) symptoms.add("Irritabilidade")
            if (checkBoxExcessiveWorry.isChecked) symptoms.add("Preocupação Excessiva")
            if (checkBoxMuscleTension.isChecked) symptoms.add("Tensão Muscular")
            if (checkBoxDifficultyPerformingFamilyTasks.isChecked) symptoms.add("Dificuldade para realizar tarefas familiares")



            val diagnosis = getDiagnosis(symptoms)
            textViewDiagnosis.text = "Baseado nos sintomas selecionados, você pode ter: $diagnosis"
        }
    }

    private fun getDiagnosis(symptoms: List<String>): String {
        return when {
            symptoms.containsAll(listOf("Febre", "Fraqueza", "Tosse")) -> "COVID-19"
            symptoms.contains("Febre") && symptoms.contains("Fraqueza") -> "Gripe"
            symptoms.contains("Tosse") -> "Resfriado Comum"
            symptoms.contains("Dor de Cabeça") -> "Enxaqueca"
            else -> "Sintomas não suficientes para um pré-diagnóstico"
        }
    }
}
