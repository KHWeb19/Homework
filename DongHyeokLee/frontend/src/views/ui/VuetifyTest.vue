<template>
    <div>
        <p class="blue lighten-4 red--text">AKMU</p>
        <p class="blue lighten-2 white--text">AKMU</p>
        <p class="indigo darken-3">AKMU</p>
        <p class="teal lighten-1 text-center">Alien</p>
        <p class="pink accent-1">불좀 꺼줄래 내 램좀 보게</p>

        <v-btn class="pink accent-1" rounded @click="roundBtnClick">Round</v-btn>
        <v-btn class="indigo lighten-5 yellow--text" @click="btnClick">Basic Button</v-btn>
         <v-btn class="teal" text>기본 버튼</v-btn>
        <v-btn class="teal" dark>기본 </v-btn>
         <v-btn class="teal" dark>
            <!-- 아이콘 사용시 항시 mdi- 가 붙는 방식으로 업데이트 됨 -->
            <v-icon>mdi-battery-alert-variant-outline</v-icon>
            <span>배터리 교체</span>
        </v-btn>

         <v-btn fab color="orange" dark>   <!-- fab 동그라미 모양 -->
            <v-icon>mdi-bluetooth</v-icon>
        </v-btn><br/>

        <v-container>
            <v-layout wrap >
                <v-flex class="primary white-text">
                    <div>불좀 꺼줄래?</div>
                </v-flex>
                <v-flex class="red white-text">
                    <div>내 램좀 보게</div>
                </v-flex>
                <v-flex class="pink">
                    <div>아아-아아- RGB 스펙트럼</div>
                </v-flex>
               
            </v-layout>
            <v-layout wrap>
                <v-flex class="indigo darken-3">
                    <div>오늘 내 기분?</div>
                </v-flex>
                 <v-flex class="pink accent-1">
                    <div>컬러로 말할게</div>
                </v-flex>
            </v-layout>
        </v-container>

        <v-layout justify-center> <!--센터 정렬 -->
            <v-dialog v-model="dialog" persisten max-width="1000"> <!-- 팝업되는거 넓이-->
                <template v-slot:activator="{ on }">
                    <v-btn color="indigo darken-3" dark v-on="on"> 결제 </v-btn> <!-- dark 하는데 글씨가 흰색으로 변 함 신기방기 -->             
                </template>
                <v-card>
                    <v-card-title> {{ service.name }}
                    </v-card-title> <!-- 클릭하면 service.name 나오고 팝업 뜸 -->
                    
                    <v-card-text>
                        하루만 니방의 rgb가 되고싶어 <!-- title밑으로 title보다 작고 연한 글씨가 나옴 -->
                    </v-card-text><br/>

                    <v-card-text>
                        아아-- 아아-- rgb 지금 특가!!<!-- title밑으로 title보다 작고 연한 글씨가 나옴 -->
                    </v-card-text>

                    <v-card-actions>
                        <v-spacer></v-spacer> <!-- 취소,결제승인이 오른쪽 하단으로 감 -->
                        <v-btn color="teal darken-1" text @click.native="btn_click($event)"> <!-- text붙이니 text만 색깔 적용 됨-->
                            취소
                        </v-btn>
                        <v-btn color="teal darken-1" text @click.native="btn_click($event)">
                            결제승인
                        </v-btn>
                    </v-card-actions>
                </v-card>
            </v-dialog>
        </v-layout>

         <v-dialog v-model="loginDialog" persisten max-width="500px">
            <template v-slot:activator="{ on }">
                <v-btn color="primary" dark v-on="on">로그인</v-btn>
            </template>
         <v-card>
             <v-card-title class="headline">
                 <span>
                    로그인
                 </span>
             </v-card-title>
             <v-card-text>
                 <v-container grid-list-md>
                     <v-layout wrap>
                         <v-flex xs12>
                             <v-text-field label="Email" v-model="userInfo.email" required solo>
                             </v-text-field>
                        </v-flex>
                        <v-flex xs12>
                                <v-text-field label="비밀번호 입력해!" v-model="userInfo.password" required solo>
                                </v-text-field>
                        </v-flex>
                     </v-layout>  
                 </v-container>              
             </v-card-text>
              <v-card-actions>
                    <v-spacer></v-spacer>
                    <v-btn color="teal darken-1" text @click="btnLoginClick($event)">
                        취소
                    </v-btn>
                    <v-btn color="teal darken-1" text @click="btnLoginClick($event)">
                        로그인
                    </v-btn>
                </v-card-actions>
         </v-card>
         </v-dialog>

        <v-toolbar>
            <v-toolbar-items>
                <v-btn class="teal lighten-4" text>First Test</v-btn>
                <v-btn class="teal lighten-3" text>Second Test</v-btn>
                <v-btn class="teal lighten-2" text>Third Test</v-btn>
            </v-toolbar-items>
        </v-toolbar>

         <v-toolbar dense dark> <!-- dense 안쓰면 그냥 툴바가 네모난데 쓰면 좀 동글동글 됨-->
            <v-app-bar-nav-icon @click="nav_drawer = !nav_drawer">
            </v-app-bar-nav-icon> <!-- 옆에 목록 아이콘 클릭하면 목록 뜨게하는것 -->
            
            <v-toolbar-title>
                <span class="font-weight-light">쵝오의 여행!</span>
                <span>꾸르팁</span>
            </v-toolbar-title>
            
            <v-toolbar-items>
                <v-btn text v-for="link in links" :key="link.icon" :to="link.route">
                    {{ link.text }}  <!-- 이거 클릭하믄 home으로 이동-->
                </v-btn>
            </v-toolbar-items>
        </v-toolbar>
       
        <v-navigation-drawer app v-model="nav_drawer" temporary> <!-- 목록 안에 들어있는 것 temporary안쓰면 화면 밀어내고 칸 하나생김 -->
            <v-list nav dense> <!-- dense에 따라 글씨 모양이 다름 -->
                <v-list-item v-for="link in links" :key="link.name" router :to="link.route">
                    <v-list-item-action>
                        <v-icon left>
                            {{ link.icon }}
                        </v-icon>
                    </v-list-item-action>
                    <v-list-item-content>
                        <v-list-item-title>
                            {{ link.text }}
                        </v-list-item-title>
                    </v-list-item-content>
                </v-list-item>
                  
                  <v-list-item v-for="link in links" :key="link.name" router :to="link.route"> 
                    <v-list-item-action>
                        <v-icon left>
                            {{ link.icon }}
                        </v-icon>
                    </v-list-item-action>
                    <v-list-item-content>
                        <v-list-item-title>
                            {{ link.text }}
                        </v-list-item-title>
                    </v-list-item-content>
                </v-list-item>     <!-- 요래하면 목록 2개 뜨게 함 -->   
            </v-list>
        </v-navigation-drawer> 

        <div>
            <v-menu offset-y> <!-- offset-y없으면 제목가리고 목록 뜨는데 있으면 제목 밑으로 메뉴 뜨게함 -->
                <template v-slot:activator="{ on }">
                    <v-btn color='teal darken-1' class="white--text ma-5" v-on="on">
                        마! 이거시 Drop Down!
                    </v-btn>
                </template>  <!-- 클릭하면 리스트 뜨게 함 -->

                <v-list>
                    <v-list-item v-for="(dropItem, index) in dropItems" :key="index" link>
                        <v-list-item-title>
                            {{ dropItem.title }}
                        </v-list-item-title>
                    </v-list-item>
                </v-list>
            </v-menu>
        </div>

        <v-container>
            <v-data-table :headers="headerTitle"
                        :items="contents"
                        :items-per-page="10"
                        class="elevation-1">
            </v-data-table>
        </v-container>
        
    </div>
</template>

<script>
export default {
    data () {
        return {
            loginDialog: false,
            dialog: false,
            nav_drawer: false,
            headerTitle: [
                { text: '번호', value: 'boardNo', width: "70px" },
                { text: '제목', value: 'title', width: "200px" },
                { text: '작성자', value: 'writer', width: "100px" },
                { text: '내용', value: 'content', width: "100px" },
            ],
            contents: [
                { boardNo: 1, title: '야호', writer: '으마으마', content: '으아아아앜' },
                { boardNo: 2, title: '호야', writer: '어마어마', content: '으어어어엌' },
                { boardNo: 3, title: '호야호야', writer: '어이크후', content: '어이크후' },
                { boardNo: 4, title: '야호', writer: '으마으마', content: '으아아아앜' },
                { boardNo: 5, title: '호야', writer: '어마어마', content: '으어어어엌' },
                { boardNo: 6, title: '호야호야', writer: '어이크후', content: '어이크후' },
                { boardNo: 7, title: '야호', writer: '으마으마', content: '으아아아앜' },
                { boardNo: 8, title: '호야', writer: '어마어마', content: '으어어어엌' },
                { boardNo: 9, title: '호야호야', writer: '어이크후', content: '어이크후' },
                { boardNo: 10, title: '야호', writer: '으마으마', content: '으아아아앜' },
                { boardNo: 11, title: '호야', writer: '어마어마', content: '으어어어엌' },
                { boardNo: 12, title: '호야호야', writer: '어이크후', content: '어이크후' },
                { boardNo: 13, title: '야호', writer: '으마으마', content: '으아아아앜' },
                { boardNo: 14, title: '호야', writer: '어마어마', content: '으어어어엌' },
                { boardNo: 15, title: '호야호야', writer: '어이크후', content: '어이크후' },
            ],
            
            service: {
                name: 'rgb'
            },   
            userInfo: {
                email: '',
                password: ''
            },
              links: [
                { icon: 'mdi-home', text: 'Home', name: 'home', route: '/' }
            ],
            dropItems: [
                { title: 'Click Me 1' },
                { title: 'Click Me 2' },
                { title: 'Click Me 3' },
                { title: 'Click Me 4' }
            ]
        }
    },
   
    methods: {
        roundBtnClick() {
            alert("아아- 아아- RGB DOT COM")
        },
        btnClick() {
            alert("하루만 니 방의 램이 되고 싶어")
        }
    }
    
}
</script>

<style scoped>

.v-application p {
    margin-bottom: 0px;
}

</style>