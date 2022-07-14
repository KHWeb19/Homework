import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class ProfileHeader extends StatelessWidget {
  const ProfileHeader({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Row(
      children: [
        const SizedBox(width: 20),
        _buildHeaderAvatar(),
        const SizedBox(width: 20),
        _buildHeaderProfile()
      ],
    );
  }

  Widget _buildHeaderAvatar() {
    return const SizedBox(
      width: 100,
      height: 100,
      child: CircleAvatar(
        backgroundImage: AssetImage('assets/smile.png'),
      ),
    );
  }

  Widget _buildHeaderProfile() {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: const [
        Text(
          "Smile Face",
          style: TextStyle(fontSize: 23, fontWeight: FontWeight.w700),
        ),
        Text(
            "스마일리 들어주세요",
            style: TextStyle(fontSize: 20)
        ),
        Text(
          "예나 노래 좋아요",
          style: TextStyle(fontSize: 15),
        )
      ],
    );
  }
}