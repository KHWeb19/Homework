<template>
    <div>

        <v-dialog v-model="loginDialog" persisten max-width="500px">
            <template v-slot:activator="{ on }">
                <v-btn color="primary" dark v-on="on">점수 계산</v-btn>
            </template>
            <v-card>
                <v-card-title class="headline">
                    <span>
                        점수를 입력하세요
                    </span>
                </v-card-title>
                <v-card-text>
                    <v-container grid-list-md>
                        <v-layout wrap>
                            <v-flex xs6>
                                <v-text-field label="자바" v-model="javaScore">
                                </v-text-field>
                            </v-flex>

                            <v-flex xs6>
                                <v-text-field label="SQL" v-model="sqlScore">
                                </v-text-field>
                            </v-flex> 
                        </v-layout>
                    </v-container>
                </v-card-text>

                <v-card-actions>
                    <v-spacer></v-spacer>
                    <v-btn color="teal darken-1" text @click="mergeScore">
                        계산하기
                    </v-btn>
                </v-card-actions>


                <v-card-text>
                    <v-container grid-list-md>
                        <v-layout wrap>                            <v-flex xs6>
                                <v-text-field label="총점" readonly/>
                            </v-flex>
                            <v-flex xs6>
                                <v-text-field label="평균" v-model="averageScore" readonly/>
                            </v-flex>
                        </v-layout>
                    </v-container>
                </v-card-text>

            </v-card>
        </v-dialog>

    </div>
</template>

<script>
export default {
    name: 'scoreTest',
}
</script>