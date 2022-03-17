<template>
    <div>
        <div>
            <v-img class="responsive-img" src="@/assets/img/akmu.gif"/> <!-- 파일 gif가 처음에 GIF로 들어와서 작동이 안됌 , gif 소문자로 해줘야함-->
        </div>

        <div class="video-container" >
            <iframe  width="1200" height="500" src="https://www.youtube.com/embed/F32KhavFboo" 
            title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
        </div>

         <div class="row">
            <!-- md로 동작하는 것은 960을 넘어가면
                sm으로 동작하는 것은 가로폭 960 미만부터!
                 안 붙어 있는 녀석은 600을 기준으로 왔다갔다함 -->  
            <div class="col-4 col-sm-8 col-md-12 yellow text-center">12</div> <!--  md 12가 최대인듯? -->
            <div class="col-2 col-sm-2 green text-center">2</div>
            <div class="col-sm-1 blue text-center">1</div>
            <div class="col-sm-1 blue text-center">1</div>
            <div class="col-sm-1 blue text-center">1</div>
            <div class="col-sm-1 blue text-center">1</div>
            <div class="col-sm-1 blue text-center">1</div>
            <div class="col-sm-1 blue text-center">1</div>
            <div class="col-sm-1 blue text-center">1</div>
            <div class="col-sm-1 blue text-center">1</div>
            <div class="col-sm-1 blue text-center">1</div>
            <div class="col-sm-1 blue text-center">1</div>

            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
            <div class="col-sm-1 red text-center">1</div>
        </div>

        <v-app id="inspire">
            <v-container class="grey lighten-5"> <!-- 바깥 테두리에 미세하게 색깔이 있다 -->
                <v-row no-gutters> <!-- row 옆으로 나란히 박스 나오게 함 no-gutters는 서로 안 붙게해줌 -->
                    <v-col cols="12" sm="6" md="8" >
                        <v-card class="pa-2 yellow" outlined tile> <!-- class에 색깔 넣으면 색깔 변함 -->
                            .col-12 .col-sm-6 .col-md-8
                        </v-card>
                    </v-col>
                    <v-col cols="6" md="4">
                        <v-card class="pa-2" outlined tile>
                            .col-6 .col-md-4
                        </v-card>
                    </v-col>
                    
                    
                </v-row>
            </v-container>
        
            <v-container class="grey lighten-5">
                <v-row no-gutters>
                    <v-col class="col-12 col-sm-12 yellow text-center">
                        <div>12</div>
                    </v-col>
                    <v-col class="col-12 col-sm-2 green text-center">
                        <div>2</div>
                    </v-col>
                    <v-col class="col-12 col-sm-4 blue text-center">
                        <div>4</div>
                    </v-col>
                    <v-col class="col-12 col-sm-6 purple text-center">
                        <div>6</div>
                    </v-col>
                </v-row>
            </v-container>
        </v-app>

        
    </div>
</template>

