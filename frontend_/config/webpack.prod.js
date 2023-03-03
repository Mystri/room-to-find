const path = require('path');
const ESLintPlugin = require('eslint-webpack-plugin');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const { CleanWebpackPlugin } = require('clean-webpack-plugin');

const MiniCssExtractPlugin = require('mini-css-extract-plugin');
const CssMinimizerWebpackPlugin = require('css-minimizer-webpack-plugin');

module.exports = {
  entry: ['./src/js/index.js', './src/index.html'],
  output: {
    path: path.resolve(__dirname, 'dist'),
    filename: 'js/index.js',
    assetModuleFilename: 'media/[hash][ext][query]',
  },
  mode: 'production',
  module: {
    rules: [
      // parsing styles
      {
        test: /\.less$/,
        use: [
          'style-loader',
          'css-loader',
          'less-loader',
        ],
      },
      // babel compatibility
      {
        test: /\.m?js$/,
        exclude: /(node_modules)/,
        use: {
          loader: 'babel-loader',
          options: {
            presets: ['@babel/preset-env'],
          },

        },

      },
      // parsing <img> label in html
      {
        test: /\.html$/i,
        loader: 'html-loader',
      },
      {
        test: /\.(jpg|png)/,
        type: 'asset/resource',
        generator: {
          filename: 'images/[hash][ext][query]',
        },
      },

    ],

  },
  resolve: {
    extensions: ['.js', '.jsx'],
  },
  plugins: [
    new ESLintPlugin(),
    new HtmlWebpackPlugin({
      template: 'src/index.html',
    }),
    new CleanWebpackPlugin(),
    new MiniCssExtractPlugin({
      filename: 'css/[name].css',
    }),
    new CssMinimizerWebpackPlugin(),
  ],
  devtool: 'source-map',
};
