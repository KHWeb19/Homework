<template>
  <div>
    <p class="red lighten-3 white--text">빨강</p>
    <p class="orange lighten-1 white--text">주황</p>
    <p class="yellow darken-1 white--text">노랑</p>
    <p class="green lighten=1">가운데 정렬</p>

    <v-btn class="blue" rounded @click="roundBtnClick">둥근 버튼</v-btn>
    <v-btn class="purple white--text">기본 버튼</v-btn>
    <v-btn class="orange" text>
      <v-icon>mdi-bluetooth</v-icon>
      <span>블루투스</span>
    </v-btn>
    <v-btn fab color="blue" dark>
      <v-icon>mdi-apple</v-icon>
    </v-btn>
    <br />

    <v-container>
      <v-layout wrap>
        <v-flex class="primary white--text">
          <div>기본</div>
        </v-flex>
        <v-flex class="red white--text">
          <div>빨강</div>
        </v-flex>
        <v-flex class="orange white--text">
          <div>주황</div>
        </v-flex>
        <v-flex class="yellow white--text">
          <div>노랑</div>
        </v-flex>
      </v-layout>
    </v-container>
    <br />

    <v-layout justify-center>
      <v-dialog v-model="dialog" persisten max-width="400">
        <template v-slot:activator="{ on }">
          <v-btn color="primary" dark v-on="on">상세 정보</v-btn>
        </template>
        <v-card>
          <v-card-title class="headline">
            {{ service.name }}
          </v-card-title>
          <v-card-text> 가나다라마바사 </v-card-text>
          <br />
          <v-card-text> 아자차카타파하 </v-card-text>
          <v-card-actions>
            <v-btn
              color="orange lighten-3"
              text
              @click.native="btn_click($event)"
            >
              취소
            </v-btn>
            <v-btn
              color="orange lighten-3"
              text
              @click.native="btn_click($event)"
            >
              더 보기
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
          <span>로그인</span>
        </v-card-title>
        <v-card-text>
          <v-container grid-list-md>
            <v-layout wrap>
              <v-flex xs12>
                <v-text-field
                  label="아이디"
                  v-model="user.Id"
                  required
                  solo
                ></v-text-field>
              </v-flex>
              <v-flex xs12>
                <v-text-field
                  label="비밀번호"
                  v-model="user.Pw"
                  required
                  solo
                ></v-text-field>
              </v-flex>
            </v-layout>
          </v-container>
        </v-card-text>
        <v-card-actions>
          <v-btn color="orange lighten-3" text @click="btnLoginClick($event)"
            >로그인</v-btn
          >
          <v-btn color="orange lighten-3" text @click="btnLoginClick($event)"
            >취소</v-btn
          >
        </v-card-actions>
      </v-card>
    </v-dialog>

    <v-toolbar>
      <v-toolbar-items>
        <v-btn class="orange lighten-1" text>1</v-btn>
        <v-btn class="orange lighten-2" text>2</v-btn>
        <v-btn class="orange lighten-3" text>3</v-btn>
      </v-toolbar-items>
    </v-toolbar>

    <v-toolbar dense dark>
      <v-app-bar-nav-icon
        @click="nav_drawer = !nav_drawer"
      ></v-app-bar-nav-icon>
      <v-toolbar-title>
        <span class="font-weight-light">가나다라마바사</span>
        <span>아자차카타파하</span>
      </v-toolbar-title>
      <v-toolbar-items>
        <v-btn text v-for="link in links" :key="link.icon" :to="link.route">
          {{ link.text }}
        </v-btn>
      </v-toolbar-items>
    </v-toolbar>

    <v-navigation-drawer app v-model="nav_drawer" temporary>
      <v-list nave dense>
        <v-list-item
          v-for="link in links"
          :key="link.name"
          router
          :to="link.route"
        >
          <v-list-item-action>
            <v-icon left>{{ link.icon }}</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title>
              {{ link.text }}
            </v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>

    <div>
      <v-menu offset-y>
        <template v-slot:activator="{ on }">
          <v-btn color="orange lighten -1" class="white--text ma-3" v-on="on">
            drop down
          </v-btn>
        </template>

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
      <v-data-table
        :headers="headerTitle"
        :items="contents"
        :items-per-page="10"
        class="elevatioon-1"
      ></v-data-table>
    </v-container>
  </div>
</template>

<script>
export default {
  data() {
    return {
      headerTitle: [
        { text: "번호", value: "No", width: "100px" },
        { text: "제목", value: "title", width: "300px" },
        { text: "내용", value: "content", width: "200px" },
      ],
      contents: [
        { No: 1, title: "가", content: "가가가가가가" },
        { No: 2, title: "나", content: "나나나ㅏ나나" },
        { No: 3, title: "다", content: "다다다다ㅏ닫" },
        { No: 4, title: "라", content: "라라라라라ㅏ랄" },
        { No: 5, title: "마", content: "마마마마마마마" },
      ],
      dropItems: [
        { title: "클릭해봐1" },
        { title: "클릭해봐2" },
        { title: "클릭해봐3" },
      ],
      user: {
        Id: "",
        Pw: "",
      },
      dialog: false,
      nav_drawer: false,
      service: {
        name: "한글",
      },
      links: [{ icon: "mdi-home", text: "Home", name: "home", route: "/" }],
    };
  },
  methods: {
    roundBtnClick() {
      alert("vuetify");
    },
  },
};
</script>

<style scoped>
.v-application p {
  margin-bottom: 0px;
}
</style>