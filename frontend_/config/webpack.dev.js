const path = require('path');
const ESLintPlugin = require('eslint-webpack-plugin');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const { CleanWebpackPlugin } = require('clean-webpack-plugin');

module.exports = {
  entry: ['./src/js/index.tsx', './src/index.html'],
  output: {
    path: path.resolve(__dirname, 'dist'),
    filename: 'js/index.js',
    assetModuleFilename: 'media/[hash][ext][query]',
  },
  resolve: {
    extensions: ['.tsx', '.ts', '.js'],
  },
  mode: 'development',
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
      {
        test: /\.css$/,
        use: [
          'style-loader',
          'css-loader',
        ],
      },
      // babel compatibility
      {
        test: /\.(js|jsx)$/,
        resolve: {
          extensions: ['.js', '.jsx'],
        },
        exclude: /(node_modules)/,
        use: {
          loader: 'babel-loader',
          options: {
            presets: ['@babel/preset-env'],
          },

        },

      },
      {
        test: /\.(ts|tsx)$/,
        loader: 'ts-loader',
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

  plugins: [
    new ESLintPlugin(),
    new HtmlWebpackPlugin({
      template: 'src/index.html',
    }),
    new CleanWebpackPlugin(),
  ],
  devServer: {
    static: {
      directory: path.join(__dirname, 'dist'),
    },
    port: 3001,
    hot: true,
  },
  devtool: 'eval-cheap-source-map',
};
