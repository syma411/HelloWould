# コマンドなど忘れたときにみるべし（備忘録的なやつ）
 ---
  * ローカルリポジトリからリモートリポジトリにプッシュする手順


 |コマンド      |説明 |
 |-------------|-----|
 |git add      |「ファイル名.拡張子」で変更内容を更新 (＊indexともいうらしい)
 |git commit -m|「ファイル名.拡張子」でローカルリポジトリに出力
 |git push     |  リモートリポジトリ(github)に出力することができる


 * ローカルリポジトリの作り方は後日記述
---
* pushしたときに  
  <font color = "Red">Your branch is ahead of 'origin/master' by 2 commits.
  (use "git push" to publish your local commits)</font>  
  みたいなやつがでてきたら<p class= "info">git push origin</p>でローカルとリモートのコミットを一致させる必要がある
